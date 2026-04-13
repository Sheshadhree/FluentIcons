package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowSprint20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSprint20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 6f)
            curveTo(8.526f, 6f, 7.265f, 6.91f, 6.75f, 8.2f)
            curveTo(6.587f, 8.602f, 6.5f, 9.04f, 6.5f, 9.5f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(7.293f)
            lineToRelative(-1.147f, -1.146f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(2f, 2f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(17.293f, 14f)
            horizontalLineTo(10f)
            curveToRelative(-2.485f, 0f, -4.5f, -2.015f, -4.5f, -4.5f)
            curveToRelative(0f, -0.518f, 0.088f, -1.016f, 0.249f, -1.479f)
            curveTo(6.36f, 6.262f, 8.033f, 5f, 10f, 5f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            curveToRelative(0f, 0.925f, -0.28f, 1.785f, -0.758f, 2.5f)
            horizontalLineTo(12.45f)
            curveToRelative(0.649f, -0.635f, 1.051f, -1.52f, 1.051f, -2.5f)
            curveTo(13.5f, 7.567f, 11.933f, 6f, 10f, 6f)
            close()
            moveToRelative(-7.5f, 7f)
            horizontalLineToRelative(3.257f)
            curveToRelative(0.314f, 0.38f, 0.677f, 0.716f, 1.08f, 1f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 14f, 2f, 13.776f, 2f, 13.5f)
            reflectiveCurveTo(2.224f, 13f, 2.5f, 13f)
            close()
        }
    }.build()
}
