package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlipVertical48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlipVertical48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(39.423f, 4.197f)
            curveTo(39.783f, 4.427f, 40f, 4.824f, 40f, 5.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(5.25f)
            curveToRelative(-0.587f, 0f, -1.095f, -0.408f, -1.22f, -0.981f)
            curveToRelative(-0.127f, -0.573f, 0.163f, -1.157f, 0.695f, -1.403f)
            lineToRelative(33.5f, -15.5f)
            curveToRelative(0.387f, -0.18f, 0.839f, -0.149f, 1.198f, 0.08f)
            close()
            moveTo(10.928f, 19.5f)
            horizontalLineTo(37.5f)
            verticalLineTo(7.206f)
            lineTo(10.928f, 19.5f)
            close()
            moveTo(40f, 43f)
            curveToRelative(0f, 0.342f, -0.175f, 0.66f, -0.464f, 0.844f)
            curveToRelative(-0.289f, 0.184f, -0.652f, 0.207f, -0.962f, 0.06f)
            lineToRelative(-34f, -16f)
            curveToRelative(-0.423f, -0.199f, -0.652f, -0.665f, -0.55f, -1.122f)
            curveTo(4.127f, 26.325f, 4.532f, 26f, 5f, 26f)
            horizontalLineToRelative(34f)
            curveToRelative(0.553f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(16f)
            close()
        }
    }.build()
}
