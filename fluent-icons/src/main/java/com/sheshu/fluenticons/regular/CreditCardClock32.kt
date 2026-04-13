package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CreditCardClock32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CreditCardClock32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 9.5f)
            curveTo(2f, 7.015f, 4.015f, 5f, 6.5f, 5f)
            horizontalLineToRelative(19f)
            curveTo(27.985f, 5f, 30f, 7.015f, 30f, 9.5f)
            verticalLineToRelative(7.843f)
            curveToRelative(-0.57f, -0.705f, -1.245f, -1.322f, -2f, -1.828f)
            verticalLineTo(13f)
            horizontalLineTo(4f)
            verticalLineToRelative(9.5f)
            curveTo(4f, 23.88f, 5.12f, 25f, 6.5f, 25f)
            horizontalLineToRelative(7.723f)
            curveToRelative(0.16f, 0.701f, 0.4f, 1.372f, 0.712f, 2f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 27f, 2f, 24.985f, 2f, 22.5f)
            verticalLineToRelative(-13f)
            close()
            moveTo(6.5f, 7f)
            curveTo(5.12f, 7f, 4f, 8.12f, 4f, 9.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(24f)
            verticalLineTo(9.5f)
            curveTo(28f, 8.12f, 26.88f, 7f, 25.5f, 7f)
            horizontalLineToRelative(-19f)
            close()
            moveTo(23f, 30.5f)
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
