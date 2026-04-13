package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Space3D24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Space3D24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(11.5f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(15f)
            horizontalLineToRelative(-0.813f)
            lineToRelative(-2.25f, -3f)
            horizontalLineTo(19.5f)
            verticalLineTo(6.25f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(12f)
            horizontalLineToRelative(1.563f)
            lineToRelative(-2.25f, 3f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            close()
            moveTo(15.692f, 16.5f)
            horizontalLineTo(21f)
            verticalLineToRelative(1.25f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-0.667f)
            lineToRelative(-0.367f, -1.224f)
            lineToRelative(-1.024f, -3.276f)
            close()
            moveToRelative(2.62f, -1.5f)
            horizontalLineToRelative(-3.089f)
            lineToRelative(-0.937f, -3f)
            horizontalLineToRelative(1.777f)
            lineToRelative(2.25f, 3f)
            close()
            moveToRelative(-7.789f, 0f)
            horizontalLineToRelative(3.129f)
            lineToRelative(-0.938f, -3f)
            horizontalLineToRelative(-1.44f)
            lineToRelative(-0.75f, 3f)
            close()
            moveToRelative(3.598f, 1.5f)
            horizontalLineToRelative(-3.973f)
            lineTo(9.023f, 21f)
            horizontalLineToRelative(6.494f)
            lineToRelative(-0.234f, -0.78f)
            lineToRelative(-1.162f, -3.72f)
            close()
            moveTo(9.726f, 12f)
            lineToRelative(-0.75f, 3f)
            horizontalLineToRelative(-3.29f)
            lineToRelative(2.25f, -3f)
            horizontalLineToRelative(1.79f)
            close()
            moveToRelative(-1.125f, 4.5f)
            horizontalLineTo(3f)
            verticalLineToRelative(1.25f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineToRelative(1.227f)
            lineToRelative(1.125f, -4.5f)
            close()
        }
    }.build()
}
