package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CardUi20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CardUi20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6.5f)
            curveTo(2f, 5.12f, 3.12f, 4f, 4.5f, 4f)
            horizontalLineToRelative(11f)
            curveTo(16.88f, 4f, 18f, 5.12f, 18f, 6.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-11f)
            curveTo(3.12f, 16f, 2f, 14.88f, 2f, 13.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(9.5f, 6f)
            horizontalLineToRelative(-5f)
            curveTo(4.224f, 6f, 4f, 6.224f, 4f, 6.5f)
            reflectiveCurveTo(4.224f, 7f, 4.5f, 7f)
            horizontalLineToRelative(5f)
            curveTo(9.776f, 7f, 10f, 6.776f, 10f, 6.5f)
            reflectiveCurveTo(9.776f, 6f, 9.5f, 6f)
            close()
            moveToRelative(3f, 2f)
            horizontalLineToRelative(-8f)
            curveTo(4.224f, 8f, 4f, 8.224f, 4f, 8.5f)
            reflectiveCurveTo(4.224f, 9f, 4.5f, 9f)
            horizontalLineToRelative(8f)
            curveTo(12.776f, 9f, 13f, 8.776f, 13f, 8.5f)
            reflectiveCurveTo(12.776f, 8f, 12.5f, 8f)
            close()
            moveTo(5f, 11f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}
