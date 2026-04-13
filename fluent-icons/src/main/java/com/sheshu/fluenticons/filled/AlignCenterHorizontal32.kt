package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignCenterHorizontal32: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignCenterHorizontal32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(30f, 16f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.933f, 0f, -3.5f, -1.567f, -3.5f, -3.5f)
            verticalLineTo(17f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-3f)
            curveTo(6.567f, 27f, 5f, 25.433f, 5f, 23.5f)
            verticalLineTo(17f)
            horizontalLineTo(3f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(2f)
            verticalLineTo(8.5f)
            curveTo(5f, 6.567f, 6.567f, 5f, 8.5f, 5f)
            horizontalLineToRelative(3f)
            curveTo(13.433f, 5f, 15f, 6.567f, 15f, 8.5f)
            verticalLineTo(15f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-3.5f)
            curveTo(17f, 9.567f, 18.567f, 8f, 20.5f, 8f)
            horizontalLineToRelative(3f)
            curveToRelative(1.933f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            verticalLineTo(15f)
            horizontalLineToRelative(2f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            close()
        }
    }.build()
}
