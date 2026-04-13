package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CreditCardClock32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CreditCardClock32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 5f)
            curveTo(4.015f, 5f, 2f, 7.015f, 2f, 9.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(28f)
            verticalLineTo(9.5f)
            curveTo(30f, 7.015f, 27.985f, 5f, 25.5f, 5f)
            horizontalLineToRelative(-19f)
            close()
            moveTo(2f, 22.5f)
            verticalLineTo(13f)
            horizontalLineToRelative(28f)
            verticalLineToRelative(4.343f)
            curveTo(28.35f, 15.303f, 25.827f, 14f, 23f, 14f)
            curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
            curveToRelative(0f, 1.437f, 0.337f, 2.795f, 0.935f, 4f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 27f, 2f, 24.985f, 2f, 22.5f)
            close()
            moveToRelative(21f, 8f)
            curveToRelative(-4.142f, 0f, -7.5f, -3.358f, -7.5f, -7.5f)
            curveToRelative(0f, -4.142f, 3.358f, -7.5f, 7.5f, -7.5f)
            curveToRelative(4.142f, 0f, 7.5f, 3.358f, 7.5f, 7.5f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            close()
            moveTo(22.75f, 18f)
            curveTo(22.336f, 18f, 22f, 18.336f, 22f, 18.75f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(23.5f)
            verticalLineToRelative(-3.75f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            close()
        }
    }.build()
}
