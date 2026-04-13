package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignSpaceEvenlyVertical24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignSpaceEvenlyVertical24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 2f)
            curveTo(5.12f, 2f, 4f, 3.12f, 4f, 4.5f)
            verticalLineToRelative(1f)
            curveTo(4f, 6.88f, 5.12f, 8f, 6.5f, 8f)
            horizontalLineToRelative(11f)
            curveTo(18.88f, 8f, 20f, 6.88f, 20f, 5.5f)
            verticalLineToRelative(-1f)
            curveTo(20f, 3.12f, 18.88f, 2f, 17.5f, 2f)
            horizontalLineToRelative(-11f)
            close()
            moveToRelative(0f, 7f)
            curveTo(5.12f, 9f, 4f, 10.12f, 4f, 11.5f)
            verticalLineToRelative(1f)
            curveTo(4f, 13.88f, 5.12f, 15f, 6.5f, 15f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-11f)
            close()
            moveToRelative(0f, 7f)
            curveTo(5.12f, 16f, 4f, 17.12f, 4f, 18.5f)
            verticalLineToRelative(1f)
            curveTo(4f, 20.88f, 5.12f, 22f, 6.5f, 22f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-11f)
            close()
        }
    }.build()
}
