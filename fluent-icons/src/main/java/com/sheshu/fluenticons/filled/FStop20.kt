package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FStop20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FStop20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.08f, 5.681f)
            curveToRelative(0.28f, -1.629f, 1.995f, -2.58f, 3.525f, -1.955f)
            lineToRelative(0.361f, 0.148f)
            curveToRelative(0.384f, 0.157f, 0.821f, -0.027f, 0.978f, -0.41f)
            curveToRelative(0.157f, -0.384f, -0.027f, -0.822f, -0.41f, -0.978f)
            lineToRelative(-0.36f, -0.148f)
            curveToRelative(-2.419f, -0.99f, -5.131f, 0.515f, -5.572f, 3.09f)
            lineTo(8.991f, 9f)
            horizontalLineTo(5.75f)
            curveTo(5.336f, 9f, 5f, 9.335f, 5f, 9.75f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(2.984f)
            lineToRelative(-0.507f, 2.962f)
            curveToRelative(-0.31f, 1.813f, -2.363f, 2.73f, -3.92f, 1.751f)
            lineToRelative(-0.158f, -0.098f)
            curveTo(3.8f, 14.895f, 3.336f, 15f, 3.115f, 15.35f)
            curveTo(2.895f, 15.7f, 3f, 16.164f, 3.351f, 16.385f)
            lineToRelative(0.157f, 0.098f)
            curveToRelative(2.462f, 1.548f, 5.707f, 0.098f, 6.198f, -2.768f)
            lineToRelative(0.55f, -3.215f)
            horizontalLineToRelative(2.994f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            curveTo(14f, 9.335f, 13.664f, 9f, 13.25f, 9f)
            horizontalLineToRelative(-2.737f)
            lineToRelative(0.567f, -3.32f)
            close()
        }
    }.build()
}
