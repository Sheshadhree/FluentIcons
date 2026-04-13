package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.ArrowUndo32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ArrowUndo32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 3.5f)
            curveTo(6f, 3.224f, 5.776f, 3f, 5.5f, 3f)
            reflectiveCurveTo(5f, 3.224f, 5f, 3.5f)
            verticalLineToRelative(12f)
            curveTo(5f, 15.776f, 5.224f, 16f, 5.5f, 16f)
            horizontalLineToRelative(12f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(17.776f, 15f, 17.5f, 15f)
            horizontalLineTo(6.707f)
            lineToRelative(9.07f, -9.07f)
            curveToRelative(2.477f, -2.476f, 6.46f, -2.576f, 9.056f, -0.227f)
            curveToRelative(2.786f, 2.522f, 2.895f, 6.862f, 0.238f, 9.52f)
            lineTo(12.145f, 28.145f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineTo(25.778f, 15.93f)
            curveToRelative(3.061f, -3.062f, 2.936f, -8.063f, -0.274f, -10.968f)
            curveToRelative(-2.992f, -2.707f, -7.58f, -2.592f, -10.434f, 0.26f)
            lineTo(6f, 14.292f)
            verticalLineTo(3.5f)
            close()
        }
    }.build()
}
