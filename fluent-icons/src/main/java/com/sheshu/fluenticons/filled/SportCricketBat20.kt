package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SportCricketBat20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SportCricketBat20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.23f, 7.936f)
            curveToRelative(-0.15f, 0.237f, -0.232f, 0.514f, -0.232f, 0.8f)
            verticalLineToRelative(1.388f)
            lineToRelative(-0.01f, 0.197f)
            curveToRelative(-0.045f, 0.458f, -0.247f, 0.89f, -0.576f, 1.217f)
            lineToRelative(-5.878f, 5.878f)
            curveToRelative(-0.78f, 0.781f, -2.047f, 0.78f, -2.828f, 0f)
            lineToRelative(-2.12f, -2.12f)
            curveToRelative(-0.781f, -0.782f, -0.781f, -2.048f, 0f, -2.829f)
            lineToRelative(5.88f, -5.88f)
            curveTo(8.841f, 6.21f, 9.35f, 6f, 9.88f, 6f)
            horizontalLineToRelative(1.37f)
            curveToRelative(0.288f, 0f, 0.567f, -0.085f, 0.806f, -0.238f)
            lineToRelative(2.174f, 2.174f)
            close()
            moveToRelative(1.2f, -5.496f)
            curveToRelative(0.587f, -0.586f, 1.536f, -0.586f, 2.122f, 0f)
            curveToRelative(0.585f, 0.585f, 0.586f, 1.535f, 0f, 2.12f)
            lineTo(14.91f, 7.203f)
            lineToRelative(-2.12f, -2.12f)
            lineToRelative(2.64f, -2.642f)
            close()
        }
    }.build()
}
