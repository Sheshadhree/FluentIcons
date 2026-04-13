package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceTentative16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceTentative16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.993f, 8.097f)
            curveToRelative(-0.052f, 4.341f, -3.56f, 7.85f, -7.902f, 7.902f)
            lineToRelative(7.902f, -7.902f)
            close()
            moveTo(15.537f, 5.33f)
            curveToRelative(-0.271f, -0.766f, -0.656f, -1.48f, -1.135f, -2.118f)
            lineTo(3.206f, 14.409f)
            curveToRelative(0.639f, 0.478f, 1.351f, 0.863f, 2.118f, 1.134f)
            lineTo(15.537f, 5.33f)
            close()
            moveTo(1.591f, 12.798f)
            curveToRelative(-0.48f, -0.64f, -0.865f, -1.352f, -1.138f, -2.119f)
            lineToRelative(10.22f, -10.22f)
            curveToRelative(0.767f, 0.273f, 1.48f, 0.66f, 2.118f, 1.139f)
            lineToRelative(-11.2f, 11.2f)
            close()
            moveTo(7.908f, 0f)
            curveTo(3.558f, 0.046f, 0.04f, 3.564f, -0.006f, 7.914f)
            lineTo(7.908f, 0f)
            close()
        }
    }.build()
}
