package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WindowShield24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WindowShield24",
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
            verticalLineToRelative(5.726f)
            curveToRelative(-0.567f, -0.178f, -1.08f, -0.48f, -1.5f, -0.79f)
            verticalLineTo(8.5f)
            horizontalLineToRelative(-15f)
            verticalLineToRelative(9.25f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(6.482f)
            curveToRelative(0.29f, 0.54f, 0.666f, 1.042f, 1.122f, 1.5f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveToRelative(14.99f, 4.944f)
            curveToRelative(0.652f, 0.651f, 1.907f, 1.686f, 3.449f, 1.899f)
            curveTo(21.747f, 13.135f, 22f, 13.378f, 22f, 13.682f)
            verticalLineToRelative(2.838f)
            curveToRelative(0f, 3.816f, -3.58f, 5.201f, -4.353f, 5.456f)
            curveToRelative(-0.097f, 0.032f, -0.196f, 0.032f, -0.293f, 0f)
            curveTo(16.58f, 21.721f, 13f, 20.336f, 13f, 16.52f)
            verticalLineToRelative(-2.838f)
            curveToRelative(0f, -0.304f, 0.253f, -0.547f, 0.561f, -0.59f)
            curveToRelative(1.542f, -0.212f, 2.797f, -1.247f, 3.45f, -1.898f)
            curveToRelative(0.26f, -0.259f, 0.719f, -0.259f, 0.979f, 0f)
            close()
        }
    }.build()
}
