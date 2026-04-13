package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LocationCheckmark24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationCheckmark24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.966f, 18.047f)
            lineToRelative(1.187f, -1.174f)
            curveToRelative(3.4f, -3.4f, 3.4f, -8.914f, 0f, -12.314f)
            curveToRelative(-3.4f, -3.4f, -8.913f, -3.4f, -12.314f, 0f)
            curveToRelative(-3.4f, 3.4f, -3.4f, 8.914f, 0f, 12.314f)
            curveToRelative(0.296f, 0.296f, 0.663f, 0.66f, 1.102f, 1.09f)
            lineToRelative(3.491f, 3.396f)
            curveToRelative(0.872f, 0.843f, 2.256f, 0.843f, 3.128f, 0f)
            curveToRelative(1.396f, -1.35f, 2.531f, -2.453f, 3.406f, -3.312f)
            close()
            moveTo(15.22f, 7.961f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.267f, 0.266f, 0.29f, 0.683f, 0.073f, 0.976f)
            lineTo(16.28f, 9.022f)
            lineToRelative(-5f, 5f)
            curveToRelative(-0.266f, 0.266f, -0.683f, 0.29f, -0.976f, 0.072f)
            lineToRelative(-0.084f, -0.072f)
            lineToRelative(-2.5f, -2.5f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.768f, 0f, -1.061f)
            curveToRelative(0.266f, -0.266f, 0.683f, -0.29f, 0.976f, -0.073f)
            lineToRelative(0.084f, 0.073f)
            lineToRelative(1.97f, 1.97f)
            lineToRelative(4.47f, -4.47f)
            close()
        }
    }.build()
}
