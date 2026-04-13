package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SplitHorizontal32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SplitHorizontal32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 15f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(26f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(3f)
            close()
            moveToRelative(3f, 11.5f)
            verticalLineToRelative(-8f)
            horizontalLineToRelative(20f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-13f)
            curveTo(7.567f, 30f, 6f, 28.433f, 6f, 26.5f)
            close()
            moveToRelative(20f, -13f)
            verticalLineToRelative(-8f)
            curveTo(26f, 3.567f, 24.433f, 2f, 22.5f, 2f)
            horizontalLineToRelative(-13f)
            curveTo(7.567f, 2f, 6f, 3.567f, 6f, 5.5f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(20f)
            close()
        }
    }.build()
}
