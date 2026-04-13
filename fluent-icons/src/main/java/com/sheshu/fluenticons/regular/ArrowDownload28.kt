package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowDownload28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDownload28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.75f, 3.75f)
            curveTo(14.75f, 3.336f, 14.414f, 3f, 14f, 3f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(14.69f)
            lineToRelative(-4.97f, -4.97f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(6.25f, 6.25f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(6.25f, -6.25f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-4.97f, 4.97f)
            verticalLineTo(3.75f)
            close()
            moveToRelative(-9f, 19.75f)
            curveTo(5.336f, 23.5f, 5f, 23.835f, 5f, 24.25f)
            curveTo(5f, 24.664f, 5.336f, 25f, 5.75f, 25f)
            horizontalLineToRelative(16.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            curveToRelative(0f, -0.415f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(5.75f)
            close()
        }
    }.build()
}
