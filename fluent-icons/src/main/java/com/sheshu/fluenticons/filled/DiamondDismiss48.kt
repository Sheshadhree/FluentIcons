package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DiamondDismiss48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DiamondDismiss48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.835f, 28.42f)
            curveToRelative(-2.441f, -2.441f, -2.441f, -6.398f, 0f, -8.839f)
            lineTo(19.582f, 5.833f)
            curveToRelative(2.44f, -2.441f, 6.398f, -2.441f, 8.839f, 0f)
            lineTo(42.17f, 19.58f)
            curveToRelative(2.44f, 2.44f, 2.44f, 6.398f, 0f, 8.839f)
            lineTo(28.422f, 42.168f)
            curveToRelative(-2.441f, 2.441f, -6.398f, 2.441f, -8.84f, 0f)
            lineTo(5.835f, 28.42f)
            close()
            moveToRelative(13.299f, -11.054f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, 1.28f, 0f, 1.768f)
            lineTo(22.232f, 24f)
            lineToRelative(-4.866f, 4.866f)
            curveToRelative(-0.488f, 0.488f, -0.488f, 1.28f, 0f, 1.768f)
            reflectiveCurveToRelative(1.28f, 0.488f, 1.768f, 0f)
            lineTo(24f, 25.768f)
            lineToRelative(4.866f, 4.866f)
            curveToRelative(0.488f, 0.488f, 1.28f, 0.488f, 1.768f, 0f)
            reflectiveCurveToRelative(0.488f, -1.28f, 0f, -1.768f)
            lineTo(25.768f, 24f)
            lineToRelative(4.866f, -4.866f)
            curveToRelative(0.488f, -0.488f, 0.488f, -1.28f, 0f, -1.768f)
            reflectiveCurveToRelative(-1.28f, -0.488f, -1.768f, 0f)
            lineTo(24f, 22.232f)
            lineToRelative(-4.866f, -4.866f)
            close()
        }
    }.build()
}
