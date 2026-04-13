package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextBold24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextBold24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 5.75f)
            curveTo(6f, 4.784f, 6.784f, 4f, 7.75f, 4f)
            horizontalLineToRelative(4.749f)
            curveToRelative(2.823f, 0f, 4.751f, 2.34f, 4.751f, 4.75f)
            curveToRelative(0f, 0.931f, -0.288f, 1.852f, -0.803f, 2.632f)
            curveTo(17.369f, 12.239f, 18f, 13.47f, 18f, 15f)
            curveToRelative(0f, 3.133f, -2.677f, 5f, -5f, 5f)
            horizontalLineTo(7.75f)
            curveTo(6.784f, 20f, 6f, 19.216f, 6f, 18.25f)
            verticalLineTo(5.75f)
            close()
            moveToRelative(3.5f, 7.75f)
            verticalLineToRelative(3f)
            horizontalLineTo(13f)
            curveToRelative(0.312f, 0f, 0.71f, -0.138f, 1.024f, -0.421f)
            curveToRelative(0.288f, -0.26f, 0.476f, -0.615f, 0.476f, -1.079f)
            curveToRelative(0f, -0.888f, -0.745f, -1.5f, -1.5f, -1.5f)
            horizontalLineTo(9.5f)
            close()
            moveToRelative(0f, -3.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.715f, 0f, 1.25f, -0.592f, 1.25f, -1.25f)
            curveToRelative(0f, -0.657f, -0.536f, -1.25f, -1.251f, -1.25f)
            horizontalLineTo(9.5f)
            verticalLineTo(10f)
            close()
        }
    }.build()
}
