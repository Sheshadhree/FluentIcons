package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.EmojiSad16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EmojiSad16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 8f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            reflectiveCurveTo(2f, 4.686f, 2f, 8f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            close()
            moveTo(3f, 8f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.239f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.239f, -5f, -5f)
            close()
            moveToRelative(4f, -1.25f)
            curveTo(7f, 7.164f, 6.664f, 7.5f, 6.25f, 7.5f)
            reflectiveCurveTo(5.5f, 7.164f, 5.5f, 6.75f)
            reflectiveCurveTo(5.836f, 6f, 6.25f, 6f)
            reflectiveCurveTo(7f, 6.336f, 7f, 6.75f)
            close()
            moveToRelative(3.5f, 0f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(9f, 7.164f, 9f, 6.75f)
            reflectiveCurveTo(9.336f, 6f, 9.75f, 6f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            close()
            moveToRelative(-4.368f, 4.072f)
            curveToRelative(0.925f, -1.096f, 2.81f, -1.096f, 3.736f, 0f)
            curveToRelative(0.178f, 0.212f, 0.493f, 0.238f, 0.704f, 0.06f)
            curveToRelative(0.212f, -0.178f, 0.238f, -0.493f, 0.06f, -0.704f)
            curveToRelative(-1.325f, -1.57f, -3.94f, -1.57f, -5.264f, 0f)
            curveToRelative(-0.178f, 0.21f, -0.152f, 0.526f, 0.06f, 0.704f)
            curveToRelative(0.21f, 0.178f, 0.526f, 0.152f, 0.704f, -0.06f)
            close()
        }
    }.build()
}
