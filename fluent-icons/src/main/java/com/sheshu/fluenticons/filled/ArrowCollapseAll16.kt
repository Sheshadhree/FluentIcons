package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCollapseAll16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCollapseAll16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 3.75f)
            curveTo(1f, 3.336f, 1.336f, 3f, 1.75f, 3f)
            horizontalLineToRelative(12.5f)
            curveTo(14.664f, 3f, 15f, 3.336f, 15f, 3.75f)
            reflectiveCurveTo(14.664f, 4.5f, 14.25f, 4.5f)
            horizontalLineTo(1.75f)
            curveTo(1.336f, 4.5f, 1f, 4.164f, 1f, 3.75f)
            close()
            moveToRelative(7f, 3f)
            curveTo(8f, 6.336f, 8.336f, 6f, 8.75f, 6f)
            horizontalLineToRelative(5.5f)
            curveTo(14.664f, 6f, 15f, 6.336f, 15f, 6.75f)
            reflectiveCurveTo(14.664f, 7.5f, 14.25f, 7.5f)
            horizontalLineToRelative(-5.5f)
            curveTo(8.336f, 7.5f, 8f, 7.164f, 8f, 6.75f)
            close()
            moveTo(4.78f, 6.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineTo(3.5f, 8.56f)
            verticalLineToRelative(4.69f)
            curveTo(3.5f, 13.664f, 3.836f, 14f, 4.25f, 14f)
            reflectiveCurveTo(5f, 13.664f, 5f, 13.25f)
            verticalLineTo(8.56f)
            lineToRelative(0.72f, 0.72f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-2f, -2f)
            close()
        }
    }.build()
}
