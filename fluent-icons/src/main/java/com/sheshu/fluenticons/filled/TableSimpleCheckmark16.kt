package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableSimpleCheckmark16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableSimpleCheckmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 14f)
            horizontalLineToRelative(3f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-3f)
            horizontalLineTo(8.5f)
            verticalLineTo(14f)
            close()
            moveToRelative(0f, -6.5f)
            horizontalLineTo(14f)
            verticalLineToRelative(-3f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(5.5f)
            close()
            moveTo(7.5f, 2f)
            verticalLineToRelative(5.5f)
            horizontalLineTo(2f)
            verticalLineToRelative(-3f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(3f)
            close()
            moveTo(2f, 11.5f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(5.5f)
            verticalLineTo(14f)
            horizontalLineToRelative(-3f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            close()
            moveToRelative(10.854f, -0.646f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-0.75f, -0.75f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineTo(11f, 11.293f)
            lineToRelative(1.146f, -1.147f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            close()
        }
    }.build()
}
