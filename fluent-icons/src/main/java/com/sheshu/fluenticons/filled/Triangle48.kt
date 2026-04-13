package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Triangle48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Triangle48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.471f, 7.228f)
            curveToRelative(1.617f, -2.99f, 5.916f, -2.966f, 7.5f, 0.042f)
            lineToRelative(15.533f, 29.502f)
            curveToRelative(1.49f, 2.83f, -0.562f, 6.23f, -3.76f, 6.23f)
            horizontalLineTo(8.255f)
            curveToRelative(-3.22f, 0f, -5.27f, -3.44f, -3.738f, -6.272f)
            lineTo(20.47f, 7.228f)
            close()
        }
    }.build()
}
