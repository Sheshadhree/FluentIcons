package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SplitVertical32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SplitVertical32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 29f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            verticalLineToRelative(26f)
            close()
            moveToRelative(11.5f, -3f)
            horizontalLineToRelative(-8f)
            verticalLineTo(6f)
            horizontalLineToRelative(8f)
            curveTo(28.433f, 6f, 30f, 7.567f, 30f, 9.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            close()
            moveToRelative(-13f, -20f)
            horizontalLineToRelative(-8f)
            curveTo(3.567f, 6f, 2f, 7.567f, 2f, 9.5f)
            verticalLineToRelative(13f)
            curveTo(2f, 24.433f, 3.567f, 26f, 5.5f, 26f)
            horizontalLineToRelative(8f)
            verticalLineTo(6f)
            close()
        }
    }.build()
}
