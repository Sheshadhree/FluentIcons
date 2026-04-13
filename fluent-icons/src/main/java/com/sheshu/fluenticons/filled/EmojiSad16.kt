package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.EmojiSad16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EmojiSad16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            close()
            moveTo(6.25f, 7.5f)
            curveTo(6.664f, 7.5f, 7f, 7.164f, 7f, 6.75f)
            reflectiveCurveTo(6.664f, 6f, 6.25f, 6f)
            reflectiveCurveTo(5.5f, 6.336f, 5.5f, 6.75f)
            reflectiveCurveTo(5.836f, 7.5f, 6.25f, 7.5f)
            close()
            moveToRelative(3.5f, 0f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(10.164f, 6f, 9.75f, 6f)
            reflectiveCurveTo(9f, 6.336f, 9f, 6.75f)
            reflectiveCurveTo(9.336f, 7.5f, 9.75f, 7.5f)
            close()
            moveToRelative(0.118f, 3.322f)
            curveToRelative(0.178f, 0.212f, 0.493f, 0.238f, 0.704f, 0.06f)
            curveToRelative(0.212f, -0.178f, 0.238f, -0.493f, 0.06f, -0.704f)
            curveToRelative(-1.325f, -1.57f, -3.94f, -1.57f, -5.264f, 0f)
            curveToRelative(-0.178f, 0.21f, -0.152f, 0.526f, 0.06f, 0.704f)
            curveToRelative(0.21f, 0.178f, 0.526f, 0.152f, 0.704f, -0.06f)
            curveToRelative(0.925f, -1.096f, 2.81f, -1.096f, 3.736f, 0f)
            close()
        }
    }.build()
}
