package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Mailbox16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Mailbox16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 1.5f)
            curveTo(2f, 1.224f, 2.224f, 1f, 2.5f, 1f)
            horizontalLineToRelative(3f)
            curveTo(5.776f, 1f, 6f, 1.224f, 6f, 1.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(3.354f)
            curveTo(8.524f, 6.733f, 8f, 7.805f, 8f, 9f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.364f, 0.097f, 0.706f, 0.268f, 1f)
            horizontalLineTo(2f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(9f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            verticalLineToRelative(3.5f)
            curveTo(4f, 9.776f, 4.224f, 10f, 4.5f, 10f)
            reflectiveCurveTo(5f, 9.776f, 5f, 9.5f)
            verticalLineTo(4f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 4f, 2f, 3.776f, 2f, 3.5f)
            verticalLineToRelative(-2f)
            close()
            moveTo(12f, 6f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(9f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            close()
            moveToRelative(-0.5f, 3f)
            horizontalLineToRelative(1f)
            curveTo(12.776f, 9f, 13f, 9.224f, 13f, 9.5f)
            reflectiveCurveTo(12.776f, 10f, 12.5f, 10f)
            horizontalLineToRelative(-1f)
            curveTo(11.224f, 10f, 11f, 9.776f, 11f, 9.5f)
            reflectiveCurveTo(11.224f, 9f, 11.5f, 9f)
            close()
        }
    }.build()
}
