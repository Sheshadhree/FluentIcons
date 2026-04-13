package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HandPoint28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HandPoint28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 2f)
            curveToRelative(-1.656f, 0f, -3f, 1.343f, -3f, 3f)
            verticalLineToRelative(8.085f)
            lineToRelative(-1.14f, -0.518f)
            curveToRelative(-2.313f, -1.051f, -5.045f, -0.376f, -6.603f, 1.631f)
            curveToRelative(-0.504f, 0.65f, -0.228f, 1.571f, 0.49f, 1.881f)
            curveToRelative(7.212f, 3.116f, 9.074f, 5.921f, 9.82f, 7.942f)
            curveToRelative(0.455f, 1.23f, 1.67f, 2.155f, 3.092f, 1.952f)
            lineToRelative(5.498f, -0.784f)
            curveToRelative(1.104f, -0.158f, 2.004f, -0.967f, 2.277f, -2.049f)
            lineToRelative(1.387f, -5.483f)
            curveToRelative(0.853f, -3.371f, -1.46f, -6.723f, -4.914f, -7.122f)
            lineTo(16f, 10.085f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            close()
        }
    }.build()
}
