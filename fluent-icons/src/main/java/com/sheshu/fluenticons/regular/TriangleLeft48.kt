package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TriangleLeft48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TriangleLeft48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.435f, 22.241f)
            curveToRelative(-1.239f, 0.652f, -1.249f, 2.422f, -0.017f, 3.088f)
            lineToRelative(29.501f, 15.954f)
            curveToRelative(1.166f, 0.63f, 2.583f, -0.214f, 2.583f, -1.54f)
            verticalLineTo(8.256f)
            curveToRelative(0f, -1.317f, -1.4f, -2.162f, -2.566f, -1.549f)
            lineTo(8.435f, 22.241f)
            close()
            moveToRelative(-1.207f, 5.287f)
            curveToRelative(-2.99f, -1.617f, -2.966f, -5.915f, 0.042f, -7.499f)
            lineTo(36.772f, 4.495f)
            curveToRelative(2.83f, -1.49f, 6.23f, 0.562f, 6.23f, 3.76f)
            verticalLineToRelative(31.488f)
            curveToRelative(0f, 3.22f, -3.44f, 5.27f, -6.272f, 3.739f)
            lineTo(7.228f, 27.528f)
            close()
        }
    }.build()
}
