package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowAutofitDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowAutofitDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.712f, 14.767f)
            lineToRelative(-0.71f, 0.735f)
            verticalLineTo(2.75f)
            curveToRelative(0f, -0.414f, -0.335f, -0.75f, -0.75f, -0.75f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(12.756f)
            lineToRelative(-0.713f, -0.739f)
            curveToRelative(-0.287f, -0.298f, -0.762f, -0.306f, -1.06f, -0.018f)
            curveToRelative(-0.298f, 0.287f, -0.306f, 0.762f, -0.018f, 1.06f)
            lineToRelative(1.82f, 1.886f)
            curveToRelative(0.394f, 0.407f, 1.046f, 0.407f, 1.44f, 0f)
            lineToRelative(1.82f, -1.886f)
            curveToRelative(0.288f, -0.298f, 0.28f, -0.773f, -0.018f, -1.06f)
            curveToRelative(-0.298f, -0.288f, -0.773f, -0.28f, -1.06f, 0.018f)
            close()
            moveTo(5f, 17f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6.25f)
            curveTo(11.664f, 3f, 12f, 3.336f, 12f, 3.75f)
            reflectiveCurveTo(11.664f, 4.5f, 11.25f, 4.5f)
            horizontalLineTo(5f)
            curveTo(4.724f, 4.5f, 4.5f, 4.724f, 4.5f, 5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(4.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(9.664f, 17f, 9.25f, 17f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}
