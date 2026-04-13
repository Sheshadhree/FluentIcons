package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WeatherFog24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherFog24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.745f, 19.5f)
            horizontalLineToRelative(8.501f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(16.246f, 21f)
            horizontalLineTo(7.745f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.693f, 0.648f, -0.743f)
            lineTo(7.745f, 19.5f)
            horizontalLineToRelative(8.501f)
            horizontalLineToRelative(-8.501f)
            close()
            moveTo(4.75f, 16.52f)
            horizontalLineToRelative(14.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.335f, 0.75f, 0.75f)
            curveToRelative(0f, 0.379f, -0.282f, 0.693f, -0.648f, 0.742f)
            lineTo(19.25f, 18.02f)
            horizontalLineTo(4.75f)
            curveTo(4.336f, 18.02f, 4f, 17.684f, 4f, 17.27f)
            curveToRelative(0f, -0.38f, 0.282f, -0.693f, 0.648f, -0.743f)
            lineTo(4.75f, 16.52f)
            close()
            moveTo(12f, 3.004f)
            curveToRelative(3.168f, 0f, 4.966f, 2.097f, 5.227f, 4.63f)
            horizontalLineToRelative(0.08f)
            curveToRelative(2.04f, 0f, 3.692f, 1.649f, 3.692f, 3.683f)
            curveTo(21f, 13.35f, 19.346f, 15f, 17.307f, 15f)
            horizontalLineTo(6.693f)
            curveTo(4.653f, 15f, 3f, 13.351f, 3f, 11.318f)
            curveToRelative(0f, -2.034f, 1.653f, -3.683f, 3.692f, -3.683f)
            horizontalLineToRelative(0.08f)
            curveTo(7.035f, 5.085f, 8.83f, 3.005f, 12f, 3.005f)
            close()
        }
    }.build()
}
