package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Mailbox20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Mailbox20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 2.5f)
            curveTo(3f, 2.224f, 3.224f, 2f, 3.5f, 2f)
            horizontalLineToRelative(4f)
            curveTo(7.776f, 2f, 8f, 2.224f, 8f, 2.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(3.671f)
            curveTo(10.651f, 8.825f, 10f, 10.086f, 10f, 11.5f)
            verticalLineTo(17f)
            curveToRelative(0f, 0.364f, 0.097f, 0.706f, 0.268f, 1f)
            horizontalLineTo(3f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-5.5f)
            curveTo(2f, 9.567f, 3.567f, 8f, 5.5f, 8f)
            horizontalLineTo(6f)
            verticalLineToRelative(3.5f)
            curveTo(6f, 11.776f, 6.224f, 12f, 6.5f, 12f)
            reflectiveCurveTo(7f, 11.776f, 7f, 11.5f)
            verticalLineTo(5f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 5f, 3f, 4.776f, 3f, 4.5f)
            verticalLineToRelative(-2f)
            close()
            moveTo(14.5f, 8f)
            curveTo(12.567f, 8f, 11f, 9.567f, 11f, 11.5f)
            verticalLineTo(17f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-5.5f)
            curveTo(18f, 9.567f, 16.433f, 8f, 14.5f, 8f)
            close()
            moveToRelative(-1.25f, 3.5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            close()
        }
    }.build()
}
