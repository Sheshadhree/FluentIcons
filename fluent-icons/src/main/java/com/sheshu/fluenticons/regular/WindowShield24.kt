package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.WindowShield24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.WindowShield24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(11.5f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineToRelative(7.604f)
            curveToRelative(-0.456f, -0.458f, -0.831f, -0.96f, -1.122f, -1.5f)
            horizontalLineTo(6.25f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            verticalLineTo(8.5f)
            horizontalLineToRelative(15f)
            verticalLineToRelative(2.685f)
            curveToRelative(0.42f, 0.31f, 0.933f, 0.613f, 1.5f, 0.79f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(19.5f, 7f)
            horizontalLineToRelative(-15f)
            verticalLineTo(6.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineTo(7f)
            close()
            moveToRelative(-1.51f, 4.194f)
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
