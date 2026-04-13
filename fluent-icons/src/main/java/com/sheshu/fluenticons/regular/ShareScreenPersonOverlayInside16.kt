package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ShareScreenPersonOverlayInside16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShareScreenPersonOverlayInside16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 5f)
            curveTo(3.448f, 5f, 3f, 5.448f, 3f, 6f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(3f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(4f)
            close()
            moveToRelative(9f, 3.75f)
            curveTo(13f, 8.337f, 12.664f, 8f, 12.25f, 8f)
            horizontalLineToRelative(-2.5f)
            curveTo(9.336f, 8f, 9f, 8.336f, 9f, 8.75f)
            verticalLineToRelative(0.5f)
            curveTo(9f, 10.216f, 9.783f, 11f, 10.75f, 11f)
            horizontalLineToRelative(0.498f)
            curveTo(12.215f, 11f, 13f, 10.217f, 13f, 9.252f)
            verticalLineTo(8.75f)
            close()
            moveTo(11f, 7f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
            moveTo(3.5f, 3f)
            curveTo(2.12f, 3f, 1f, 4.12f, 1f, 5.5f)
            verticalLineToRelative(5f)
            curveTo(1f, 11.88f, 2.12f, 13f, 3.5f, 13f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveTo(15f, 4.12f, 13.88f, 3f, 12.5f, 3f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(2f, 5.5f)
            curveTo(2f, 4.672f, 2.672f, 4f, 3.5f, 4f)
            horizontalLineToRelative(9f)
            curveTo(13.328f, 4f, 14f, 4.672f, 14f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            curveTo(2.672f, 12f, 2f, 11.328f, 2f, 10.5f)
            verticalLineToRelative(-5f)
            close()
        }
    }.build()
}
