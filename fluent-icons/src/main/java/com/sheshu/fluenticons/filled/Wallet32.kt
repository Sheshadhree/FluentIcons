package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Wallet32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Wallet32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(16.75f)
            curveTo(24.545f, 3f, 26f, 4.455f, 26f, 6.25f)
            verticalLineToRelative(1.006f)
            curveToRelative(1.748f, 0.618f, 3f, 2.285f, 3f, 4.244f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-17f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineTo(6.25f)
            horizontalLineToRelative(0.01f)
            curveTo(3.004f, 6.168f, 3f, 6.084f, 3f, 6f)
            close()
            moveToRelative(21f, 0.25f)
            curveTo(24f, 5.56f, 23.44f, 5f, 22.75f, 5f)
            horizontalLineTo(6f)
            curveTo(5.448f, 5f, 5f, 5.448f, 5f, 6f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(18f)
            verticalLineTo(6.25f)
            close()
            moveTo(21f, 18f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(3f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}
