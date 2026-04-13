package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChatCursor20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChatCursor20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            curveTo(4.686f, 1f, 2f, 3.686f, 2f, 7f)
            curveToRelative(0f, 1.04f, 0.265f, 2.019f, 0.73f, 2.872f)
            lineToRelative(-0.71f, 2.49f)
            curveToRelative(-0.052f, 0.179f, 0f, 0.37f, 0.134f, 0.5f)
            curveToRelative(0.134f, 0.127f, 0.328f, 0.171f, 0.504f, 0.112f)
            lineToRelative(2.338f, -0.779f)
            curveTo(5.88f, 12.707f, 6.906f, 13f, 8f, 13f)
            curveToRelative(0.34f, 0f, 0.675f, -0.028f, 1f, -0.083f)
            verticalLineToRelative(-4.17f)
            curveToRelative(0f, -1.49f, 1.743f, -2.298f, 2.88f, -1.335f)
            lineToRelative(1.801f, 1.523f)
            curveTo(13.888f, 8.329f, 14f, 7.677f, 14f, 7f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            close()
            moveToRelative(2f, 7.746f)
            verticalLineToRelative(9.003f)
            curveToRelative(0f, 0.74f, 0.96f, 1.033f, 1.373f, 0.418f)
            lineToRelative(1.978f, -2.946f)
            curveTo(13.444f, 15.083f, 13.6f, 15f, 13.766f, 15f)
            horizontalLineToRelative(3.487f)
            curveToRelative(0.698f, 0f, 1.018f, -0.871f, 0.484f, -1.322f)
            lineToRelative(-6.502f, -5.504f)
            curveTo(10.747f, 7.76f, 10f, 8.108f, 10f, 8.746f)
            close()
        }
    }.build()
}
