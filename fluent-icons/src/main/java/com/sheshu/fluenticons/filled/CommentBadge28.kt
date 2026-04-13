package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CommentBadge28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentBadge28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.536f, 3f)
            curveTo(20.196f, 3.588f, 20f, 4.271f, 20f, 5f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            curveToRelative(0.729f, 0f, 1.412f, -0.197f, 2f, -0.537f)
            verticalLineToRelative(8.787f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineToRelative(-5.941f)
            lineToRelative(-6.536f, 4.715f)
            curveTo(8.616f, 26.549f, 7f, 25.723f, 7f, 24.295f)
            verticalLineTo(21f)
            horizontalLineTo(5.75f)
            curveTo(3.679f, 21f, 2f, 19.321f, 2f, 17.25f)
            verticalLineTo(6.75f)
            curveTo(2f, 4.679f, 3.679f, 3f, 5.75f, 3f)
            horizontalLineToRelative(14.786f)
            close()
            moveTo(24f, 2f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            close()
        }
    }.build()
}
