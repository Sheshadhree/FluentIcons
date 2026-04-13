package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCurveDownLeft28: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCurveDownLeft28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.401f, 3.378f)
            curveToRelative(-0.205f, -0.36f, -0.663f, -0.485f, -1.023f, -0.28f)
            curveTo(13.072f, 6.132f, 13f, 11.269f, 13f, 14.75f)
            verticalLineToRelative(7.69f)
            lineToRelative(-4.72f, -4.72f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.768f, 0f, 1.06f)
            lineToRelative(6f, 6f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(6f, -6f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-4.72f, 4.72f)
            verticalLineToRelative(-7.69f)
            curveToRelative(0f, -3.518f, 0.128f, -7.78f, 4.622f, -10.349f)
            curveToRelative(0.36f, -0.205f, 0.485f, -0.663f, 0.28f, -1.023f)
            close()
        }
    }.build()
}
