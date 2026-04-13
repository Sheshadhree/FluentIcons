package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SaveCopy20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SaveCopy20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(9f)
            curveTo(2f, 14.88f, 3.12f, 16f, 4.5f, 16f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-9f)
            curveTo(16f, 3.12f, 14.88f, 2f, 13.5f, 2f)
            horizontalLineToRelative(-9f)
            close()
            moveToRelative(5f, 4.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(2f)
            curveTo(11.776f, 8.5f, 12f, 8.724f, 12f, 9f)
            reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(2f)
            curveTo(9.5f, 11.776f, 9.276f, 12f, 9f, 12f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(-2f)
            curveTo(6.224f, 9.5f, 6f, 9.276f, 6f, 9f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-2f)
            curveTo(8.5f, 6.224f, 8.724f, 6f, 9f, 6f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            close()
            moveTo(7.5f, 18f)
            curveToRelative(-0.953f, 0f, -1.818f, -0.381f, -2.45f, -1f)
            horizontalLineToRelative(9.45f)
            curveToRelative(1.381f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(5.05f)
            curveToRelative(0.619f, 0.632f, 1f, 1.496f, 1f, 2.45f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
