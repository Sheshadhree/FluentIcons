package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentArrowLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentArrowLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-6.81f)
            curveToRelative(1.121f, -1.168f, 1.81f, -2.753f, 1.81f, -4.5f)
            curveToRelative(0f, -3.59f, -2.91f, -6.5f, -6.5f, -6.5f)
            curveToRelative(-0.886f, 0f, -1.73f, 0.177f, -2.5f, 0.498f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            close()
            moveToRelative(1.5f, 0.5f)
            verticalLineTo(8f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(5.5f)
            lineToRelative(-6f, -6f)
            close()
            moveToRelative(-1.5f, 15f)
            curveToRelative(0f, 3.038f, -2.462f, 5.5f, -5.5f, 5.5f)
            reflectiveCurveTo(1f, 20.538f, 1f, 17.5f)
            reflectiveCurveTo(3.462f, 12f, 6.5f, 12f)
            reflectiveCurveToRelative(5.5f, 2.462f, 5.5f, 5.5f)
            close()
            moveTo(9.5f, 18f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(9.776f, 17f, 9.5f, 17f)
            horizontalLineTo(4.707f)
            lineToRelative(1.647f, -1.646f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineToRelative(-2.5f, 2.5f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(2.5f, 2.5f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineTo(4.707f, 18f)
            horizontalLineTo(9.5f)
            close()
        }
    }.build()
}
