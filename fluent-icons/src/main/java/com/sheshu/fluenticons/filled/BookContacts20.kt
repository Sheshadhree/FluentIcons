package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookContacts20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookContacts20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(15.776f, 17f, 15.5f, 17f)
            horizontalLineTo(6f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            horizontalLineToRelative(10f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            close()
            moveToRelative(4f, 11f)
            curveToRelative(-2.143f, 0f, -3f, -0.938f, -3f, -1.875f)
            curveTo(7f, 10.504f, 7.576f, 10f, 8.286f, 10f)
            horizontalLineToRelative(3.428f)
            curveTo(12.424f, 10f, 13f, 10.504f, 13f, 11.125f)
            curveTo(13f, 12.059f, 12.143f, 13f, 10f, 13f)
            close()
            moveToRelative(1.5f, -5.5f)
            curveTo(11.5f, 8.328f, 10.828f, 9f, 10f, 9f)
            reflectiveCurveTo(8.5f, 8.328f, 8.5f, 7.5f)
            reflectiveCurveTo(9.172f, 6f, 10f, 6f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            close()
        }
    }.build()
}
