package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CloudCheckmark16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CloudCheckmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 3f)
            curveTo(6.343f, 3f, 5f, 4.343f, 5f, 6f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 6.5f, 2f, 7.507f, 2f, 8.75f)
            reflectiveCurveTo(3.007f, 11f, 4.25f, 11f)
            horizontalLineToRelative(0.772f)
            curveToRelative(0.031f, 0.343f, 0.094f, 0.678f, 0.185f, 1f)
            horizontalLineTo(4.25f)
            curveTo(2.455f, 12f, 1f, 10.545f, 1f, 8.75f)
            curveToRelative(0f, -1.721f, 1.338f, -3.13f, 3.03f, -3.243f)
            curveTo(4.273f, 3.531f, 5.958f, 2f, 8f, 2f)
            curveToRelative(1.93f, 0f, 3.54f, 1.366f, 3.917f, 3.184f)
            curveToRelative(-0.35f, -0.093f, -0.712f, -0.152f, -1.084f, -0.174f)
            curveTo(10.423f, 3.84f, 9.31f, 3f, 8f, 3f)
            close()
            moveToRelative(7f, 7.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(6f, 12.985f, 6f, 10.5f)
            reflectiveCurveTo(8.015f, 6f, 10.5f, 6f)
            reflectiveCurveTo(15f, 8.015f, 15f, 10.5f)
            close()
            moveToRelative(-2.146f, -1.854f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(9.5f, 11.293f)
            lineToRelative(-0.646f, -0.647f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            lineToRelative(1f, 1f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            close()
        }
    }.build()
}
