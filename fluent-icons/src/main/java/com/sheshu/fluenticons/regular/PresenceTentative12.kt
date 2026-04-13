package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceTentative12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceTentative12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 6.055f)
            curveTo(11.97f, 9.325f, 9.327f, 11.97f, 6.057f, 12f)
            lineToRelative(5.945f, -5.944f)
            close()
            moveToRelative(-0.35f, -2.082f)
            curveToRelative(-0.203f, -0.567f, -0.49f, -1.094f, -0.844f, -1.567f)
            lineToRelative(-8.4f, 8.399f)
            curveToRelative(0.474f, 0.354f, 1.002f, 0.64f, 1.568f, 0.844f)
            lineToRelative(7.676f, -7.676f)
            close()
            moveTo(1.191f, 9.587f)
            curveTo(0.84f, 9.116f, 0.554f, 8.59f, 0.351f, 8.026f)
            lineTo(8.027f, 0.35f)
            curveToRelative(0.564f, 0.203f, 1.09f, 0.488f, 1.562f, 0.84f)
            lineTo(1.19f, 9.587f)
            close()
            moveTo(5.945f, 0f)
            curveToRelative(-3.27f, 0.03f, -5.914f, 2.674f, -5.944f, 5.944f)
            lineTo(5.945f, 0f)
            close()
        }
    }.build()
}
