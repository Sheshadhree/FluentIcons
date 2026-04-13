package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableSimpleMultiple20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableSimpleMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(6f)
            verticalLineTo(2f)
            horizontalLineTo(4.5f)
            close()
            moveTo(2f, 12.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(6f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 15f, 2f, 13.88f, 2f, 12.5f)
            close()
            moveTo(9f, 15f)
            verticalLineTo(9f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(9f)
            close()
            moveToRelative(6f, -10.5f)
            verticalLineTo(8f)
            horizontalLineTo(9f)
            verticalLineTo(2f)
            horizontalLineToRelative(3.5f)
            curveTo(13.88f, 2f, 15f, 3.12f, 15f, 4.5f)
            close()
            moveTo(7.499f, 18f)
            curveToRelative(-1.21f, 0f, -2.218f, -0.859f, -2.45f, -2f)
            horizontalLineToRelative(7.45f)
            curveToRelative(1.934f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineTo(5.05f)
            curveToRelative(1.141f, 0.232f, 2f, 1.24f, 2f, 2.45f)
            verticalLineToRelative(5.75f)
            curveToRelative(0f, 2.623f, -2.127f, 4.75f, -4.75f, 4.75f)
            horizontalLineToRelative(-5.75f)
            close()
        }
    }.build()
}
