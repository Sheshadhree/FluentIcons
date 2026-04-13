package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ProtocolHandler24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ProtocolHandler24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.482f, 17.732f)
            lineToRelative(-0.775f, -0.775f)
            lineToRelative(2.482f, -2.482f)
            curveToRelative(1.367f, -1.367f, 1.367f, -3.583f, 0f, -4.95f)
            lineToRelative(-2.482f, -2.482f)
            lineToRelative(0.775f, -0.776f)
            curveToRelative(0.976f, -0.976f, 2.56f, -0.976f, 3.535f, 0f)
            lineToRelative(3.965f, 3.965f)
            curveToRelative(0.976f, 0.976f, 0.976f, 2.56f, 0f, 3.535f)
            lineToRelative(-3.965f, 3.965f)
            curveToRelative(-0.976f, 0.976f, -2.559f, 0.976f, -3.535f, 0f)
            close()
            moveToRelative(1f, -3.965f)
            curveToRelative(0.976f, -0.976f, 0.976f, -2.559f, 0f, -3.535f)
            lineToRelative(-3.965f, -3.965f)
            curveToRelative(-0.976f, -0.976f, -2.559f, -0.976f, -3.535f, 0f)
            lineToRelative(-3.965f, 3.965f)
            curveToRelative(-0.976f, 0.976f, -0.976f, 2.56f, 0f, 3.535f)
            lineToRelative(3.965f, 3.965f)
            curveToRelative(0.976f, 0.976f, 2.56f, 0.976f, 3.535f, 0f)
            lineToRelative(3.965f, -3.965f)
            close()
        }
    }.build()
}
