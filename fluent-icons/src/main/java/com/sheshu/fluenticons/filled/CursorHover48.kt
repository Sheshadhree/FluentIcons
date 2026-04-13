package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CursorHover48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CursorHover48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.75f, 9.25f)
            curveToRelative(-1.933f, 0f, -3.5f, 1.567f, -3.5f, 3.5f)
            verticalLineToRelative(18.5f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            horizontalLineTo(18f)
            verticalLineToRelative(-13.5f)
            curveToRelative(0f, -1.314f, 0.792f, -2.5f, 2.006f, -3.003f)
            curveToRelative(1.215f, -0.503f, 2.613f, -0.224f, 3.542f, 0.705f)
            lineToRelative(15.5f, 15.5f)
            curveToRelative(0.095f, 0.095f, 0.183f, 0.194f, 0.263f, 0.297f)
            curveToRelative(1.905f, -0.032f, 3.439f, -1.587f, 3.439f, -3.499f)
            verticalLineToRelative(-18.5f)
            curveToRelative(0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
            horizontalLineTo(8.75f)
            close()
            moveToRelative(13.384f, 11.116f)
            curveToRelative(-0.358f, -0.357f, -0.895f, -0.464f, -1.362f, -0.27f)
            curveTo(20.305f, 20.288f, 20f, 20.743f, 20f, 21.25f)
            verticalLineToRelative(21.5f)
            curveToRelative(0f, 0.55f, 0.359f, 1.034f, 0.884f, 1.195f)
            curveToRelative(0.525f, 0.161f, 1.094f, -0.04f, 1.401f, -0.495f)
            lineToRelative(4.961f, -7.333f)
            curveToRelative(0.178f, -0.262f, 0.5f, -0.385f, 0.808f, -0.306f)
            lineToRelative(8.386f, 2.15f)
            curveToRelative(0.545f, 0.14f, 1.117f, -0.102f, 1.396f, -0.592f)
            curveToRelative(0.279f, -0.49f, 0.196f, -1.105f, -0.202f, -1.503f)
            lineToRelative(-15.5f, -15.5f)
            close()
        }
    }.build()
}
