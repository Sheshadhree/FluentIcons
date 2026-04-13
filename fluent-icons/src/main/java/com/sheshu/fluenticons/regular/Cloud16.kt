package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Cloud16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Cloud16",
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
            horizontalLineToRelative(7.5f)
            curveTo(12.993f, 11f, 14f, 9.993f, 14f, 8.75f)
            reflectiveCurveTo(12.993f, 6.5f, 11.75f, 6.5f)
            horizontalLineTo(11.5f)
            curveTo(11.224f, 6.5f, 11f, 6.276f, 11f, 6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            close()
            moveTo(4.03f, 5.507f)
            curveTo(4.273f, 3.531f, 5.958f, 2f, 8f, 2f)
            curveToRelative(2.042f, 0f, 3.727f, 1.53f, 3.97f, 3.507f)
            curveTo(13.662f, 5.62f, 15f, 7.03f, 15f, 8.75f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-7.5f)
            curveTo(2.455f, 12f, 1f, 10.545f, 1f, 8.75f)
            curveToRelative(0f, -1.721f, 1.338f, -3.13f, 3.03f, -3.243f)
            close()
        }
    }.build()
}
