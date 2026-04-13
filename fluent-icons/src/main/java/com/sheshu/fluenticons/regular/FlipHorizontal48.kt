package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlipHorizontal48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlipHorizontal48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(43.803f, 39.423f)
            curveTo(43.573f, 39.783f, 43.176f, 40f, 42.75f, 40f)
            horizontalLineToRelative(-15.5f)
            curveTo(26.56f, 40f, 26f, 39.44f, 26f, 38.75f)
            verticalLineTo(5.25f)
            curveToRelative(0f, -0.587f, 0.408f, -1.095f, 0.981f, -1.22f)
            curveToRelative(0.573f, -0.127f, 1.157f, 0.163f, 1.403f, 0.695f)
            lineToRelative(15.5f, 33.5f)
            curveToRelative(0.18f, 0.387f, 0.149f, 0.839f, -0.08f, 1.198f)
            close()
            moveTo(28.5f, 10.928f)
            verticalLineTo(37.5f)
            horizontalLineToRelative(12.294f)
            lineTo(28.5f, 10.928f)
            close()
            moveTo(5f, 40f)
            curveToRelative(-0.342f, 0f, -0.66f, -0.175f, -0.844f, -0.464f)
            curveToRelative(-0.184f, -0.289f, -0.207f, -0.652f, -0.06f, -0.962f)
            lineToRelative(16f, -34f)
            curveToRelative(0.199f, -0.423f, 0.665f, -0.652f, 1.122f, -0.55f)
            curveTo(21.675f, 4.127f, 22f, 4.532f, 22f, 5f)
            verticalLineToRelative(34f)
            curveToRelative(0f, 0.553f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}
