package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignSpaceEvenlyHorizontal24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignSpaceEvenlyHorizontal24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 17.5f)
            curveTo(2f, 18.88f, 3.12f, 20f, 4.5f, 20f)
            horizontalLineToRelative(1f)
            curveTo(6.88f, 20f, 8f, 18.88f, 8f, 17.5f)
            verticalLineToRelative(-11f)
            curveTo(8f, 5.12f, 6.88f, 4f, 5.5f, 4f)
            horizontalLineToRelative(-1f)
            curveTo(3.12f, 4f, 2f, 5.12f, 2f, 6.5f)
            verticalLineToRelative(11f)
            close()
            moveToRelative(7f, 0f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(1f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-11f)
            curveTo(15f, 5.12f, 13.88f, 4f, 12.5f, 4f)
            horizontalLineToRelative(-1f)
            curveTo(10.12f, 4f, 9f, 5.12f, 9f, 6.5f)
            verticalLineToRelative(11f)
            close()
            moveToRelative(7f, 0f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(1f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-11f)
            curveTo(22f, 5.12f, 20.88f, 4f, 19.5f, 4f)
            horizontalLineToRelative(-1f)
            curveTo(17.12f, 4f, 16f, 5.12f, 16f, 6.5f)
            verticalLineToRelative(11f)
            close()
        }
    }.build()
}
