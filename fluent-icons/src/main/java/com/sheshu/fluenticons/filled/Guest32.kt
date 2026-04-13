package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Guest32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Guest32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.5f, 2f)
            curveTo(25.433f, 2f, 27f, 3.567f, 27f, 5.5f)
            verticalLineToRelative(21f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-15f)
            curveTo(6.567f, 30f, 5f, 28.433f, 5f, 26.5f)
            verticalLineToRelative(-21f)
            curveTo(5f, 3.567f, 6.567f, 2f, 8.5f, 2f)
            horizontalLineToRelative(15f)
            close()
            moveTo(13f, 6f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            close()
            moveToRelative(-1f, 9f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            close()
            moveToRelative(0.09f, 5f)
            curveToRelative(-1.43f, 0f, -2.59f, 1.16f, -2.59f, 2.59f)
            curveToRelative(0f, 1.556f, 0.837f, 2.71f, 2.07f, 3.423f)
            curveTo(12.76f, 26.701f, 14.33f, 27f, 16f, 27f)
            reflectiveCurveToRelative(3.24f, -0.299f, 4.43f, -0.987f)
            curveToRelative(1.233f, -0.713f, 2.07f, -1.867f, 2.07f, -3.422f)
            curveTo(22.5f, 21.16f, 21.34f, 20f, 19.91f, 20f)
            horizontalLineToRelative(-7.82f)
            close()
        }
    }.build()
}
