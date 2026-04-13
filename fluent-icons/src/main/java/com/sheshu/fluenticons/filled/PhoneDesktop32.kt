package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PhoneDesktop32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneDesktop32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 5.25f)
            curveTo(5f, 3.455f, 6.455f, 2f, 8.25f, 2f)
            horizontalLineToRelative(18.5f)
            curveTo(28.545f, 2f, 30f, 3.455f, 30f, 5.25f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(22f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(2f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-9.5f)
            verticalLineToRelative(-2f)
            horizontalLineTo(20f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(-5.5f)
            verticalLineToRelative(-5.75f)
            curveToRelative(0f, -2.623f, -2.127f, -4.75f, -4.75f, -4.75f)
            horizontalLineToRelative(-4.5f)
            curveToRelative(-0.084f, 0f, -0.167f, 0.002f, -0.25f, 0.007f)
            verticalLineTo(5.25f)
            close()
            moveToRelative(-3f, 10f)
            curveTo(2f, 13.455f, 3.455f, 12f, 5.25f, 12f)
            horizontalLineToRelative(4.5f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            verticalLineToRelative(11.5f)
            curveTo(13f, 28.545f, 11.545f, 30f, 9.75f, 30f)
            horizontalLineToRelative(-4.5f)
            curveTo(3.455f, 30f, 2f, 28.545f, 2f, 26.75f)
            verticalLineToRelative(-11.5f)
            close()
            moveTo(6f, 26f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(7f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            close()
        }
    }.build()
}
