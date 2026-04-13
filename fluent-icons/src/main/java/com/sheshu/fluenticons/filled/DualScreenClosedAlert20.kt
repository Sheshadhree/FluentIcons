package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DualScreenClosedAlert20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DualScreenClosedAlert20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 5f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            curveToRelative(1.656f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(2f)
            lineToRelative(1.32f, 1.119f)
            curveTo(18.174f, 8.419f, 17.961f, 9f, 17.495f, 9f)
            horizontalLineTo(9.503f)
            curveTo(9.037f, 9f, 8.825f, 8.42f, 9.18f, 8.119f)
            lineTo(10.5f, 7f)
            verticalLineTo(5f)
            close()
            moveToRelative(3f, 6f)
            curveToRelative(-0.653f, 0f, -1.21f, -0.418f, -1.415f, -1f)
            horizontalLineToRelative(2.829f)
            curveToRelative(-0.206f, 0.582f, -0.761f, 1f, -1.415f, 1f)
            close()
            moveToRelative(-4f, -4.463f)
            lineTo(8.532f, 7.356f)
            curveTo(7.468f, 8.259f, 8.106f, 10f, 9.503f, 10f)
            horizontalLineToRelative(1.52f)
            lineToRelative(0.119f, 0.334f)
            curveTo(11.485f, 11.303f, 12.409f, 12f, 13.499f, 12f)
            curveToRelative(0.172f, 0f, 0.34f, -0.017f, 0.501f, -0.05f)
            verticalLineTo(15f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(6f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(1.537f)
            close()
        }
    }.build()
}
