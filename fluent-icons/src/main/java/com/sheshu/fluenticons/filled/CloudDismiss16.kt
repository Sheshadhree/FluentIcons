package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CloudDismiss16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudDismiss16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.03f, 5.507f)
            curveTo(4.273f, 3.531f, 5.958f, 2f, 8f, 2f)
            curveToRelative(1.93f, 0f, 3.54f, 1.366f, 3.917f, 3.184f)
            curveTo(11.465f, 5.064f, 10.99f, 5f, 10.5f, 5f)
            curveTo(7.462f, 5f, 5f, 7.462f, 5f, 10.5f)
            curveToRelative(0f, 0.52f, 0.072f, 1.023f, 0.207f, 1.5f)
            horizontalLineTo(4.25f)
            curveTo(2.455f, 12f, 1f, 10.545f, 1f, 8.75f)
            curveToRelative(0f, -1.721f, 1.338f, -3.13f, 3.03f, -3.243f)
            close()
            moveTo(15f, 10.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(6f, 12.985f, 6f, 10.5f)
            reflectiveCurveTo(8.015f, 6f, 10.5f, 6f)
            reflectiveCurveTo(15f, 8.015f, 15f, 10.5f)
            close()
            moveToRelative(-2.646f, -1.146f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            lineTo(10.5f, 9.793f)
            lineTo(9.354f, 8.647f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.196f, 0.195f, -0.196f, 0.511f, 0f, 0.707f)
            lineTo(9.793f, 10.5f)
            lineToRelative(-1.146f, 1.146f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(1.146f, -1.147f)
            lineToRelative(1.146f, 1.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineTo(11.207f, 10.5f)
            lineToRelative(1.147f, -1.146f)
            close()
        }
    }.build()
}
