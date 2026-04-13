package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Question24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Question24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 4f)
            curveTo(9.238f, 4f, 7f, 6.238f, 7f, 9f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            curveToRelative(0f, -1.658f, 1.342f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.342f, 3f, 3f)
            curveToRelative(0f, 0.816f, -0.199f, 1.294f, -0.438f, 1.629f)
            curveToRelative(-0.262f, 0.365f, -0.625f, 0.638f, -1.128f, 0.985f)
            lineToRelative(-0.116f, 0.078f)
            curveToRelative(-0.447f, 0.306f, -1.023f, 0.699f, -1.469f, 1.247f)
            curveTo(11.322f, 13.587f, 11f, 14.406f, 11f, 15.5f)
            verticalLineTo(16f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.656f, 0.178f, -1.024f, 0.4f, -1.299f)
            curveToRelative(0.257f, -0.314f, 0.603f, -0.552f, 1.114f, -0.903f)
            lineToRelative(0.053f, -0.037f)
            curveToRelative(0.496f, -0.34f, 1.133f, -0.786f, 1.62f, -1.468f)
            curveTo(16.7f, 11.081f, 17f, 10.183f, 17f, 9f)
            curveToRelative(0f, -2.762f, -2.238f, -5f, -5f, -5f)
            close()
            moveToRelative(0f, 17.25f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            close()
        }
    }.build()
}
