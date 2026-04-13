package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Prohibited48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Prohibited48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(34.914f, 10.965f)
            curveToRelative(-6.68f, -5.606f, -16.653f, -5.267f, -22.935f, 1.014f)
            curveToRelative(-6.281f, 6.282f, -6.62f, 16.256f, -1.014f, 22.935f)
            lineToRelative(23.949f, -23.95f)
            close()
            moveToRelative(2.121f, 2.121f)
            lineToRelative(-23.949f, 23.95f)
            curveToRelative(6.68f, 5.605f, 16.653f, 5.266f, 22.935f, -1.015f)
            curveToRelative(6.281f, -6.282f, 6.62f, -16.256f, 1.014f, -22.935f)
            close()
            moveTo(9.858f, 9.858f)
            curveToRelative(7.81f, -7.81f, 20.474f, -7.81f, 28.284f, 0f)
            curveToRelative(7.81f, 7.81f, 7.81f, 20.474f, 0f, 28.284f)
            curveToRelative(-7.81f, 7.81f, -20.474f, 7.81f, -28.284f, 0f)
            curveToRelative(-7.81f, -7.81f, -7.81f, -20.474f, 0f, -28.284f)
            close()
        }
    }.build()
}
