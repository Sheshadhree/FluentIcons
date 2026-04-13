package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Comment32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Comment32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 7.5f)
            curveTo(2f, 5.015f, 4.015f, 3f, 6.5f, 3f)
            horizontalLineToRelative(19f)
            curveTo(27.985f, 3f, 30f, 5.015f, 30f, 7.5f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-7.631f)
            lineToRelative(-6.571f, 5.603f)
            curveTo(9.999f, 30.71f, 8f, 29.787f, 8f, 28.08f)
            verticalLineTo(24f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 24f, 2f, 21.985f, 2f, 19.5f)
            verticalLineToRelative(-12f)
            close()
            moveTo(6.5f, 5f)
            curveTo(5.12f, 5f, 4f, 6.12f, 4f, 7.5f)
            verticalLineToRelative(12f)
            curveTo(4f, 20.88f, 5.12f, 22f, 6.5f, 22f)
            horizontalLineTo(9f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(5.081f)
            lineToRelative(6.851f, -5.842f)
            curveTo(17.032f, 22.085f, 17.262f, 22f, 17.5f, 22f)
            horizontalLineToRelative(8f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-12f)
            curveTo(28f, 6.12f, 26.88f, 5f, 25.5f, 5f)
            horizontalLineToRelative(-19f)
            close()
        }
    }.build()
}
