package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StoreMicrosoft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StoreMicrosoft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 3.75f)
            verticalLineTo(6f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 6f, 2f, 6.336f, 2f, 6.75f)
            verticalLineToRelative(11.5f)
            curveTo(2f, 19.769f, 3.231f, 21f, 4.75f, 21f)
            horizontalLineToRelative(14.5f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineTo(6.75f)
            curveTo(22f, 6.336f, 21.664f, 6f, 21.25f, 6f)
            horizontalLineTo(16f)
            verticalLineTo(3.75f)
            curveTo(16f, 2.784f, 15.216f, 2f, 14.25f, 2f)
            horizontalLineToRelative(-4.5f)
            curveTo(8.784f, 2f, 8f, 2.784f, 8f, 3.75f)
            close()
            moveTo(9.75f, 3.5f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.138f, 0f, 0.25f, 0.112f, 0.25f, 0.25f)
            verticalLineTo(6f)
            horizontalLineToRelative(-5f)
            verticalLineTo(3.75f)
            curveToRelative(0f, -0.138f, 0.112f, -0.25f, 0.25f, -0.25f)
            close()
            moveTo(8f, 13f)
            verticalLineTo(9.5f)
            horizontalLineToRelative(3.5f)
            verticalLineTo(13f)
            horizontalLineTo(8f)
            close()
            moveToRelative(0f, 4.5f)
            verticalLineTo(14f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(3.5f)
            horizontalLineTo(8f)
            close()
            moveToRelative(8f, -4.5f)
            horizontalLineToRelative(-3.5f)
            verticalLineTo(9.5f)
            horizontalLineTo(16f)
            verticalLineTo(13f)
            close()
            moveToRelative(-3.5f, 4.5f)
            verticalLineTo(14f)
            horizontalLineTo(16f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
