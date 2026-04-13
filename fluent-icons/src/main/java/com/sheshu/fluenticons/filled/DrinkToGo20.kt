package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DrinkToGo20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DrinkToGo20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.853f, 2.147f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineTo(12.706f, 4f)
            horizontalLineToRelative(1.624f)
            curveToRelative(0.314f, 0f, 0.595f, 0.196f, 0.704f, 0.492f)
            lineToRelative(0.917f, 2.5f)
            curveTo(16.131f, 7.48f, 15.77f, 8f, 15.247f, 8f)
            horizontalLineToRelative(-0.339f)
            lineToRelative(-1.425f, 8.337f)
            curveTo(13.319f, 17.297f, 12.486f, 18f, 11.512f, 18f)
            horizontalLineTo(8.487f)
            curveToRelative(-0.975f, 0f, -1.807f, -0.702f, -1.972f, -1.663f)
            lineTo(5.09f, 8f)
            horizontalLineTo(4.75f)
            curveTo(4.23f, 8f, 3.867f, 7.48f, 4.048f, 6.99f)
            lineToRelative(0.923f, -2.5f)
            curveTo(5.079f, 4.196f, 5.36f, 4f, 5.674f, 4f)
            horizontalLineToRelative(5.642f)
            curveToRelative(0.022f, -0.037f, 0.048f, -0.072f, 0.08f, -0.103f)
            lineToRelative(1.75f, -1.75f)
            curveToRelative(0.195f, -0.196f, 0.512f, -0.196f, 0.707f, 0f)
            close()
            moveTo(5.109f, 7f)
            horizontalLineToRelative(9.78f)
            lineToRelative(-0.734f, -2f)
            horizontalLineTo(5.848f)
            lineTo(5.109f, 7f)
            close()
        }
    }.build()
}
